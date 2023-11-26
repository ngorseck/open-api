export * from './article.service';
import { ArticleService } from './article.service';
export * from './client.service';
import { ClientService } from './client.service';
export * from './commande.service';
import { CommandeService } from './commande.service';
export * from './product.service';
import { ProductService } from './product.service';
export const APIS = [ArticleService, ClientService, CommandeService, ProductService];
