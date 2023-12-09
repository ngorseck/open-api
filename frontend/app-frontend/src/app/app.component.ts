import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import {RouterLink, RouterOutlet} from '@angular/router';
import {SearchClientsComponent} from "./search-clients/search-clients.component";
import {ClientDTO} from "../lib/openapi";
import {ResultSearchClientsComponent} from "./result-search-clients/result-search-clients.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, RouterOutlet, RouterLink, SearchClientsComponent, ResultSearchClientsComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'app-frontend';

  /**
   * Valeur recu de child app-search-clients
   */
  outputClient ? : ClientDTO ;

  /**
   * handle the outPut received from child
   */
  getClient(client: ClientDTO) {
    console.log(client);
    this.outputClient = client;
  }
}
