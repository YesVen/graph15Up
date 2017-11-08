import { Component, OnInit } from '@angular/core';
import { Hero }from "../hero";
import { HEROES } from "../heroes-mock";

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})
export class HeroesComponent implements OnInit {

  constructor() { }

  hero:Hero = {
    id : 1,
    name : "Hobbit",
    address : "Ancient Kingdom"
  }

  heroes = HEROES;

  selectedHero : Hero;

  onHeroSelect(hero:Hero){
    this.selectedHero = hero;
  }

  /*
    This will be called immediately after the component is initialised
  */
  ngOnInit() {
     console.log("Heroes Component is initialised");
  }

}
