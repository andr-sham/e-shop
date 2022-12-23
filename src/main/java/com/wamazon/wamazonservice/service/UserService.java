package com.wamazon.wamazonservice.service;


import com.wamazon.wamazonservice.dto.User;

public abstract class UserService<T extends User>{
/*
    public abstract ICrudRepository<T> getRepository();




    @Override
    public boolean register(String login, String password) {
        if (login.isEmpty() || password.isEmpty()) {
            System.out.println("Попытка регистрации с пустым логином или паролем");
            return false;
        }
        if (login.length() <= 3 || password.length() <= 3) {
            System.out.println("Попытка регистрации с логином или паролем не более 3х символов");
            return false;
        }

        if (!isValidPassword(password)) {
            System.out.println("Попытка регистрации с паролем, который содержит только буквы или цифры");
            return false;
        }

        if (isLoginAlreadyUsed(login)) {
            System.out.println("Попытка регистрации с логином, который уже используется");
            return false;
        }

        getRepository().save();
        System.out.println("Пользователь " + login + " зарегистрирован");
        return true;
    }

    private boolean isLoginAlreadyUsed(String searchLogin) {
        User userByLogin = getRepository().getUserByLogin(searchLogin);
        return userByLogin != null;
    }

    private boolean isValidPassword(String password) {
        char[] chars = password.toCharArray();

        boolean hasDigit = false;
        boolean hasLetter = false;

        for (char passwordChar : chars) {
            boolean isDigit = Character.isDigit(passwordChar);

            hasDigit = hasDigit || isDigit;
            hasLetter = hasLetter || !isDigit;
        }

        return hasLetter && hasDigit;
    }

    @Override
    public T login(String login, String password) {
        T userByLogin = getRepository().getUserByLogin(login);

        if (userByLogin == null) {
            System.out.println("Авторизация не пройдена. Пользователь с логином " + login + " в системе не найден");
            return null;
        }

        boolean passwordCheckPassed = userByLogin.getPassword().equals(password);

        if (!passwordCheckPassed) {
            System.out.println("Авторизация не пройдена. Пароль для логина " + login + " указан некорректный");
            return null;
        }

        System.out.println("Пользователь " + login + " успешно авторизован.");
        return userByLogin;
    }

    @Override
    public T updateUserProfile(T user) {
        return getRepository().updateUser(user);
    }*/
}
