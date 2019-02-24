import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { WelcomeService } from './welcome.service';
import { IEvent } from './event';

@Component({
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css'],
  providers : [WelcomeService]
})
export class WelcomeComponent implements OnInit {
  items: number[] = [1, 2,3,4,5];
  events: IEvent[];
  errorMessage = 'Event List';
  constructor(private router: Router,private service:WelcomeService) { }

  ngOnInit() {
    this.service.getEvents().subscribe(events=>{this.events=events},error=>this.errorMessage=error);
  }

}
