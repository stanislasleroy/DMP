import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Account } from '../model/account';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  constructor(private httpClient: HttpClient) { }


  public getAccount() {
    return this.httpClient.get<Account>('http://localhost:8080/account');
  }
}
