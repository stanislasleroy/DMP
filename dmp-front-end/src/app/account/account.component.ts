import { Component, OnInit } from '@angular/core';
import { Account } from '../documents/model/account';
import { AccountService } from '../documents/services/account.service';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.scss']
})
export class AccountComponent implements OnInit {

  account!: Account;

  constructor(private accountService: AccountService) { }

  ngOnInit(): void {
    this.accountService.getAccount()
    .subscribe((a: Account) => this.account = a);
  }

}
