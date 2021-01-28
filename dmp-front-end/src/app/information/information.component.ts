import { Component, OnInit } from '@angular/core';
import { Information } from '../documents/model/information';
import { InformationService } from '../documents/services/information.service';

@Component({
  selector: 'app-information',
  templateUrl: './information.component.html',
  styleUrls: ['./information.component.scss']
})
export class InformationComponent implements OnInit {

  informations!: Information[];

  constructor(private informationService: InformationService) { }

  ngOnInit(): void {
    this.informationService.getInformations()
    .subscribe((i: Information[]) => this.informations = i);
  }

}
