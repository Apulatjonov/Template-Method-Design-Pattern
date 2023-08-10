package org.example;

import java.util.Objects;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 8/10/2023 15:15
 */
public class GoogleEmailVerification implements VerificationInterface {
    private Long code;

    @Override
    public Long sendCode() {
//        Logic to send the code through Google's email service
//        Math.random() is multiplied to 10 because it returns value between 0 and 1
        this.code = (long) (Math.random() * 10);
        return this.code;
    }

    @Override
    public void verifyCode(Long code) {
        if (Objects.equals(code, this.code)) {
            System.out.println("Account verified by Google Email!");
        } else {
            System.out.println("Wrong code!");
        }
    }
}
