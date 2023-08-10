package org.example;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 8/10/2023 15:10
 */
public class Main {
    public static void main(String[] args) {
        VerificationService service = new VerificationService(new GoogleEmailVerification());
        Long code = service.sendCode();
        service.verify(code);

        Long code1 = service.sendCode();
        service.verify(++code1);

        service.changeVerificationApproach(new PhoneVerification());
        Long code2 = service.sendCode();
        service.verify(code2);

        Long code3 = service.sendCode();
        service.verify(++code3);

        service.changeVerificationApproach(new SMTPEmailVerification());
        Long code4 = service.sendCode();
        service.verify(code4);

    }
}