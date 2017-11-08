import { Component, OnInit } from '@angular/core';
import { Hero }from "../hero";
import { HEROES } from "../heroes-mock";
import { HeroService } from "../hero.service";

@Component({
  selector: 'app-heroes',
  templateUrl: './heroes.component.html',
  styleUrls: ['./heroes.component.css']
})
export class HeroesComponent implements OnInit {

  constructor(private heroService : HeroService) { }

  hero:Hero = {
    id : 1,
    name : "Hobbit",
    address : "Ancient Kingdom"
  }

  heroes : Hero[];

  selectedHero : Hero;

  onHeroSelect(hero:Hero){
    this.selectedHero = hero;
  }

  getHeroes(): void {
    this.heroes = this.heroService.getHeroes();
  }
  /*
    This will be called immediately after the component is initialised
  */
  ngOnInit() {
     console.log("Heroes Component is initialised");
     this.getHeroes();
  }

}
