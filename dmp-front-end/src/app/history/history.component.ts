import { Component, OnInit } from '@angular/core';
import { History } from '../documents/model/history';
import { HistoryService } from '../documents/services/history.service';

@Component({
  selector: 'app-history',
  templateUrl: './history.component.html',
  styleUrls: ['./history.component.scss']
})
export class HistoryComponent implements OnInit {

  histories!: History[];

  constructor(private historyService: HistoryService) { }

  ngOnInit(): void {
    this.historyService.getHistories()
    .subscribe((h: History[]) => this.histories = h);
  }
}
