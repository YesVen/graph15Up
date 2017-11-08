import { Injectable } from '@angular/core';


// The @Injectable() decorator tells Angular that this service might itself have injected dependencies.
// It doesn't have dependencies now but [it will soon](#inject-message-service}. Whether it does or it doesn't,
// it's good practice to keep the decorator.
@Injectable()
export class HeroService {

  constructor() { }

}
