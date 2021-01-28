import { Component, OnInit } from '@angular/core';
import { Document } from './model/document';
import { DocumentsService } from './services/documents.service';

@Component({
  selector: 'app-documents',
  templateUrl: './documents.component.html',
  styleUrls: ['./documents.component.scss']
})
export class DocumentsComponent implements OnInit {

  documents!: Document[];

  constructor(private documentsService: DocumentsService) { }

  ngOnInit(): void {

    this.documentsService.getDocuments()
    .subscribe((d: Document[]) => this.documents = d);
    
  }

}
