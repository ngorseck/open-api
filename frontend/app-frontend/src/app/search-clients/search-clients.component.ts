import {Component, EventEmitter, Output} from '@angular/core';
import {ClientDTO, ClientService} from "../../lib/openapi";
import {HttpClientModule} from "@angular/common/http";

@Component({
  selector: 'app-search-clients',
  standalone: true,
  imports: [HttpClientModule],
  providers: [ClientService],
  templateUrl: './search-clients.component.html',
  styleUrl: './search-clients.component.css'
})
export class SearchClientsComponent {
  constructor(private clientServives: ClientService) {

  }

  /**
   * Envoie de valeur a Parent avec EventEmitter
   * Un evenement JS est defini pour pouvoir envoyer une donnee au composant Parent
   */
  @Output() getClientEvent = new EventEmitter<ClientDTO>();

  getClient(value: number) {
    console.log(value);
    this.clientServives.getClient(value)
      .subscribe({
        next: client => {
          this.getClientEvent.emit(client);
        },
        error: err => {
          console.log(err);
        }
      });
  }

  protected readonly Number = Number;
}
