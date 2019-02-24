import { Injectable } from '@angular/core';
import { IEvent } from './event';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { tap,catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class WelcomeService {

  constructor(private http: HttpClient) { }

  private eventUrl: string = "api/events";
  getEvents(): Observable<IEvent[]> {
    return this.http.post<IEvent[]>(this.eventUrl,{"action":  "READ"}).pipe(tap(data => console.log('All: ' + JSON.stringify(data))),
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
