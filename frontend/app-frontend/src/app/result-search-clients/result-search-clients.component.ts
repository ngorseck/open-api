import {Component, Input} from '@angular/core';
import {NgForOf} from "@angular/common";
import {ClientDTO} from "../../lib/openapi";

@Component({
  selector: 'app-result-search-clients',
  standalone: true,
    imports: [
        NgForOf
    ],
  templateUrl: './result-search-clients.component.html',
  styleUrl: './result-search-clients.component.css'
})
export class ResultSearchClientsComponent {

  /**
   * Valeur venant de Parent
   * Et ya rien a faire juste consommer
   */
  @Input() clientResult ? : ClientDTO ;
}
