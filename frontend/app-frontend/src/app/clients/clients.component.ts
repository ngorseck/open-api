import {Component, OnInit} from '@angular/core';
import {ClientService} from "../../lib/openapi";
import {HttpClientModule} from "@angular/common/http";
import {NgForOf} from "@angular/common";

@Component({
  selector: 'app-clients',
  standalone: true,
  imports: [HttpClientModule, NgForOf],
  providers: [ClientService],
  templateUrl: './clients.component.html',
  styleUrl: './clients.component.css'
})
export class ClientsComponent implements OnInit{

  clients: any;
  constructor(private clientServives: ClientService) {

  }
  ngOnInit() {
    this.clientServives.getAllClients(0, 2)
      .subscribe({
        next: datas => {
          this.clients = datas.clientList;
        },
        error : err => {
          console.log(err)
        }
      })
    console.log(this.clients);
  }
}
