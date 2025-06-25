package com.serafim.shorter_url_challenge.domain.code;

import java.util.Random;

public class RandomCode {

    public static String generateCode() {
        char[] map = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();

        StringBuilder code = new StringBuilder();
        Random random = new Random();

        int max = 12;
        int min = 6;
        int codeLenght = random.nextInt((max - min) + 1) + max;

        while (codeLenght > 0) {
            int randomNumber = random.nextInt(61) + 1;
            code.append(map[randomNumber]);

            codeLenght -= 1;
        }

        return code.reverse().toString();
    }
}
