package org.example;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 8/10/2023 15:10
 */
public interface VerificationInterface {
    Long sendCode();
    void verifyCode(Long code);
}
