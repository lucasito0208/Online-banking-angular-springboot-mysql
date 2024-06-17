package com.lucasDev.imagin_banco.service;

import com.lucasDev.imagin_banco.entity.PrimaryAccount;
import com.lucasDev.imagin_banco.entity.SavingsAccount;

import java.security.Principal;

/**
 * Created by IntelliJ IDEA.
 * Project : online-banking
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 09/08/18
 * Time: 04.32
 * To change this template use File | Settings | File Templates.
 */
//@Service("accountService")
public interface AccountService {

    PrimaryAccount createPrimaryAccount();

    SavingsAccount createSavingsAccount();

    void deposit(String accountType, double amount, Principal principal);

    void withdraw(String accountType, double amount, Principal principal);

}
