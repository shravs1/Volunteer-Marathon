import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { tap,catchError } from 'rxjs/operators';
import { IEvent } from '../welcome/event';

@Injectable({
  providedIn: 'root'
})
export class EventService {

  constructor(private http: HttpClient) { }

  private eventUrl: string = "static/event.json";
  getEvent(id:number): Observable<IEvent> {
    return this.http.get<IEvent>(this.eventUrl/*,{"id":id,"action":  "READ"}*/).pipe(tap(data => console.log('getEvent Response: ' + JSON.stringify(data))),
      catchError(this.handleError)
    );
  }
  private handleError(err: HttpErrorResponse): Observable<never> {
    let errorMessage = "";
    if (err.error instanceof ErrorEvent) {
      errorMessage = `An Error Occured  ${err.error.message}`;
    } else {
      errorMessage = `Server returned an Error ${err.status}, with error message ${err.message}`;
    }
    console.log(errorMessage);
    return throwError(errorMessage);
  }
}
