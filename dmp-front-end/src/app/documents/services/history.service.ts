import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { History } from '../model/history';

@Injectable({
  providedIn: 'root'
})
export class HistoryService {

  constructor(private httpClient: HttpClient) { }


  public getHistories() {
    return this.httpClient.get<History[]>('http://localhost:8080/histories');
  }
}
