import { Component, OnInit, Input } from '@angular/core';
import { Hero } from '../hero';

@Component({
  selector: 'app-hero-detail',
  templateUrl: './hero-detail.component.html',
  styleUrls: ['./hero-detail.component.css']
})
export class HeroDetailComponent implements OnInit {

  // Hero detail component is a child component of hero component.
  // Hero detail component receives a hero property as input from hero component

  //The parent HeroesComponent will control the child HeroDetailComponent by sending
  //it a new hero to display whenever the user selects a hero from the list.
  @Input() hero : Hero;

  constructor() { }

  ngOnInit() {
  }

}
