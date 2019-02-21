import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { WelcomeComponent } from './welcome/welcome.component';
import { EventInformationComponent } from './event-information/event-information.component';

const routes: Routes = [
  { path: 'welcome', component: WelcomeComponent },
  { path: 'eventinfo/:id', component: EventInformationComponent },
  { path: '', redirectTo:'welcome', pathMatch:'full' },
  { path: '**', redirectTo:'welcome',pathMatch:'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
