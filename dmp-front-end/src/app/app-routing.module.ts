import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AccountComponent } from './account/account.component';
import { AlerteComponent } from './alerte/alerte.component';
import { DocumentsComponent } from './documents/documents.component';
import { HistoryComponent } from './history/history.component';
import { InformationComponent } from './information/information.component';

const routes: Routes = [
  { path: 'informations', component: InformationComponent},
  { path: 'alerts', component: AlerteComponent},
  { path: 'documents', component: DocumentsComponent},
  { path: 'histories', component: HistoryComponent},
  { path: 'account', component: AccountComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
