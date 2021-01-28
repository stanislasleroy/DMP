import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Alert } from '../model/alert';


@Injectable({
  providedIn: 'root'
})
export class AlertService {

  constructor(private httpClient: HttpClient) { }


  public getAlerts() {
    return this.httpClient.get<Alert[]>('http://localhost:8080/alerts');
  }

}
