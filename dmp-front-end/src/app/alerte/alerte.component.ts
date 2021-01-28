import { Component, OnInit } from '@angular/core';
import { Alert } from '../documents/model/alert';
import { AlertService } from '../documents/services/alert.service';

@Component({
  selector: 'app-alerte',
  templateUrl: './alerte.component.html',
  styleUrls: ['./alerte.component.scss']
})
export class AlerteComponent implements OnInit {

  alerts!: Alert[];

  constructor(private alertService: AlertService) { }

  ngOnInit(): void {
    this.alertService.getAlerts()
    .subscribe((a: Alert[]) => this.alerts = a);
  }

}
