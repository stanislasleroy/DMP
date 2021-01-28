import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Information } from '../model/information';


@Injectable({
  providedIn: 'root'
})
export class InformationService {

  constructor(private httpClient: HttpClient) { }


  public getInformations() {
    return this.httpClient.get<Information[]>('http://localhost:8080/informations');
  }

}
