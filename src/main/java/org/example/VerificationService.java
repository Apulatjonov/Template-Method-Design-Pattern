package org.example;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 8/10/2023 15:10
 */
public class VerificationService {
    private VerificationInterface verification;

    public VerificationService(VerificationInterface verification) {
        this.verification = verification;
    }

    public void changeVerificationApproach(VerificationInterface verification){
        this.verification = verification;
    }

    public Long sendCode(){
        return verification.sendCode();
    }

    public void verify(Long code){
        verification.verifyCode(code);
    }
}
