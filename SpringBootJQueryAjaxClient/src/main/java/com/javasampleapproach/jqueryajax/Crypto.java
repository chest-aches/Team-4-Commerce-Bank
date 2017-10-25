package com.javasampleapproach.jqueryajax;

import org.springframework.security.crypto.encrypt.Encryptors;
import org.springframework.security.crypto.encrypt.TextEncryptor;
import org.springframework.security.crypto.keygen.KeyGenerators;

public class Crypto {

    public String encrypt(String textToEncrypt) {
        String password = "hFFChF6tY7Jk7wcLfBqfJ2zE";
        String salt = KeyGenerators.string().generateKey();
        TextEncryptor encryptor = Encryptors.text(password, salt);
        String encryptedText = encryptor.encrypt(textToEncrypt);

        System.out.println("Text to Encrypt: " + textToEncrypt + " Encrypted: " + encryptedText);

        return encryptedText;
    }

    public String decrypt(String textToDecrypt) {
        String password = "hFFChF6tY7Jk7wcLfBqfJ2zE";
        String salt = KeyGenerators.string().generateKey();
        TextEncryptor decryptor = Encryptors.text(password, salt);
        String decryptedText = decryptor.decrypt(textToDecrypt);

        System.out.println("Text to Decrypt: " + textToDecrypt + " Decrypted: " + decryptedText);

        return decryptedText;
    }
}
