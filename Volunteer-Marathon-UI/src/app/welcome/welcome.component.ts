import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {
  items: number[] = [1, 2,3,4,5];
  constructor(private router: Router,) { }

  ngOnInit() {
  }

}
