import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Document } from '../model/document';


@Injectable({
  providedIn: 'root'
})
export class DocumentsService {

  constructor(private httpClient: HttpClient) { }


  public getDocuments() {
    return this.httpClient.get<Document[]>('http://localhost:8080/documents');
  }

}
