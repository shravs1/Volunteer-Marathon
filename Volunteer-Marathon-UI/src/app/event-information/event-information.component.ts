import { Component, OnInit } from '@angular/core';
import { EventService } from './event.service';
import { ActivatedRoute } from '@angular/router';
import { IEvent } from '../welcome/event';
import { DatePipe } from '@angular/common';

export interface EventDetailsTable {
  field  : string;
  detail : any;
}

@Component({
  selector: 'app-event-information',
  templateUrl: './event-information.component.html',
  styleUrls: ['./event-information.component.css'],
  providers : [EventService,DatePipe]
})
export class EventInformationComponent implements OnInit {
  pageTitle : string = 'Event Information';
  event:IEvent;
  details:EventDetailsTable[];
  displayedEventColumns: string[] = ['Fields', 'Details'];
  dataSource
  constructor(private route:ActivatedRoute,private service :EventService,private datePipe : DatePipe) { }

  ngOnInit() {
    let id = +this.route.snapshot.paramMap.get('id');
    this.service.getEvent(id).subscribe(event => {
      this.event=event;
      this.details = [
        {
          field:"Event Name",
          detail:event.name
        },
        {
          field:"Benificiary Name",
          detail:event.benificiaryName
        },
        {
          field:"Start Time",
          detail:this.datePipe.transform((event.date+"T"+event.startTime),'EEEE, MMMM d, y,h:mm a')
        },{
          field:"End Time",
          detail:this.datePipe.transform((event.date+"T"+event.endTime),'EEEE, MMMM d, y,h:mm a')
        },{
          field:"Venue",
          detail:event.venueAddress
        },{
          field:"Volunteers Required Count",
          detail:event.volunteersRequired
        }
      ]
      this.dataSource = this.details;
    });
  }

}
