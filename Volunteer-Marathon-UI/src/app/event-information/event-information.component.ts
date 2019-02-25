import { Component, OnInit } from '@angular/core';
import { EventService } from './event.service';
import { ActivatedRoute } from '@angular/router';
import { IEvent } from '../welcome/event';

@Component({
  selector: 'app-event-information',
  templateUrl: './event-information.component.html',
  styleUrls: ['./event-information.component.css'],
  providers : [EventService]
})
export class EventInformationComponent implements OnInit {
  pageTitle : string = 'Event Information';
  event:IEvent;
  constructor(private route:ActivatedRoute,private service :EventService) { }

  ngOnInit() {
    let id = +this.route.snapshot.paramMap.get('id');
    this.service.getEvent(id).subscribe(event => {this.event=event});
  }

}
