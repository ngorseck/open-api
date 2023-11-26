/**
 * API de Ecommerce
 * Test de openAPI
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent, HttpParameterCodec }       from '@angular/common/http';
import { CustomHttpParameterCodec }                          from '../encoder';
import { Observable }                                        from 'rxjs';

import { CommandeDTO } from '../model/models';
import { CommandeResultListByClientDTO } from '../model/models';
import { CommandeResultListByStatutDTO } from '../model/models';
import { CommandeResultListDTO } from '../model/models';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';



@Injectable({
  providedIn: 'root'
})
export class CommandeService {

    protected basePath = 'http://localhost:8080/ecommerce/api';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();
    public encoder: HttpParameterCodec;

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (configuration) {
            this.configuration = configuration;
        }
        if (typeof this.configuration.basePath !== 'string') {
            if (typeof basePath !== 'string') {
                basePath = this.basePath;
            }
            this.configuration.basePath = basePath;
        }
        this.encoder = this.configuration.encoder || new CustomHttpParameterCodec();
    }



    private addToHttpParams(httpParams: HttpParams, value: any, key?: string): HttpParams {
        if (typeof value === "object" && value instanceof Date === false) {
            httpParams = this.addToHttpParamsRecursive(httpParams, value);
        } else {
            httpParams = this.addToHttpParamsRecursive(httpParams, value, key);
        }
        return httpParams;
    }

    private addToHttpParamsRecursive(httpParams: HttpParams, value?: any, key?: string): HttpParams {
        if (value == null) {
            return httpParams;
        }

        if (typeof value === "object") {
            if (Array.isArray(value)) {
                (value as any[]).forEach( elem => httpParams = this.addToHttpParamsRecursive(httpParams, elem, key));
            } else if (value instanceof Date) {
                if (key != null) {
                    httpParams = httpParams.append(key,
                        (value as Date).toISOString().substr(0, 10));
                } else {
                   throw Error("key may not be null if value is Date");
                }
            } else {
                Object.keys(value).forEach( k => httpParams = this.addToHttpParamsRecursive(
                    httpParams, value[k], key != null ? `${key}.${k}` : k));
            }
        } else if (key != null) {
            httpParams = httpParams.append(key, value);
        } else {
            throw Error("key may not be null if value is not object or array");
        }
        return httpParams;
    }

    /**
     * Get All Actifs Commandes
     * @param currentPage 
     * @param sizePage 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAllCommandes(currentPage: number, sizePage: number, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json'}): Observable<CommandeResultListDTO>;
    public getAllCommandes(currentPage: number, sizePage: number, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json'}): Observable<HttpResponse<CommandeResultListDTO>>;
    public getAllCommandes(currentPage: number, sizePage: number, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json'}): Observable<HttpEvent<CommandeResultListDTO>>;
    public getAllCommandes(currentPage: number, sizePage: number, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json'}): Observable<any> {
        if (currentPage === null || currentPage === undefined) {
            throw new Error('Required parameter currentPage was null or undefined when calling getAllCommandes.');
        }
        if (sizePage === null || sizePage === undefined) {
            throw new Error('Required parameter sizePage was null or undefined when calling getAllCommandes.');
        }

        let queryParameters = new HttpParams({encoder: this.encoder});
        if (currentPage !== undefined && currentPage !== null) {
          queryParameters = this.addToHttpParams(queryParameters,
            <any>currentPage, 'currentPage');
        }
        if (sizePage !== undefined && sizePage !== null) {
          queryParameters = this.addToHttpParams(queryParameters,
            <any>sizePage, 'sizePage');
        }

        let headers = this.defaultHeaders;

        let httpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (httpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
                'application/json'
            ];
            httpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        let responseType: 'text' | 'json' = 'json';
        if(httpHeaderAcceptSelected && httpHeaderAcceptSelected.startsWith('text')) {
            responseType = 'text';
        }

        return this.httpClient.get<CommandeResultListDTO>(`${this.configuration.basePath}/commandes`,
            {
                params: queryParameters,
                responseType: <any>responseType,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get All Actifs Commandes by client
     * @param currentPage 
     * @param sizePage 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAllCommandesByClient(currentPage: number, sizePage: number, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json'}): Observable<CommandeResultListByClientDTO>;
    public getAllCommandesByClient(currentPage: number, sizePage: number, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json'}): Observable<HttpResponse<CommandeResultListByClientDTO>>;
    public getAllCommandesByClient(currentPage: number, sizePage: number, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json'}): Observable<HttpEvent<CommandeResultListByClientDTO>>;
    public getAllCommandesByClient(currentPage: number, sizePage: number, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json'}): Observable<any> {
        if (currentPage === null || currentPage === undefined) {
            throw new Error('Required parameter currentPage was null or undefined when calling getAllCommandesByClient.');
        }
        if (sizePage === null || sizePage === undefined) {
            throw new Error('Required parameter sizePage was null or undefined when calling getAllCommandesByClient.');
        }

        let queryParameters = new HttpParams({encoder: this.encoder});
        if (currentPage !== undefined && currentPage !== null) {
          queryParameters = this.addToHttpParams(queryParameters,
            <any>currentPage, 'currentPage');
        }
        if (sizePage !== undefined && sizePage !== null) {
          queryParameters = this.addToHttpParams(queryParameters,
            <any>sizePage, 'sizePage');
        }

        let headers = this.defaultHeaders;

        let httpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (httpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
                'application/json'
            ];
            httpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        let responseType: 'text' | 'json' = 'json';
        if(httpHeaderAcceptSelected && httpHeaderAcceptSelected.startsWith('text')) {
            responseType = 'text';
        }

        return this.httpClient.get<CommandeResultListByClientDTO>(`${this.configuration.basePath}/commandesByClient`,
            {
                params: queryParameters,
                responseType: <any>responseType,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get All Actifs Commandes
     * @param currentPage 
     * @param sizePage 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAllCommandes_1(currentPage: number, sizePage: number, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json'}): Observable<CommandeResultListByStatutDTO>;
    public getAllCommandes_1(currentPage: number, sizePage: number, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json'}): Observable<HttpResponse<CommandeResultListByStatutDTO>>;
    public getAllCommandes_1(currentPage: number, sizePage: number, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json'}): Observable<HttpEvent<CommandeResultListByStatutDTO>>;
    public getAllCommandes_1(currentPage: number, sizePage: number, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json'}): Observable<any> {
        if (currentPage === null || currentPage === undefined) {
            throw new Error('Required parameter currentPage was null or undefined when calling getAllCommandes_1.');
        }
        if (sizePage === null || sizePage === undefined) {
            throw new Error('Required parameter sizePage was null or undefined when calling getAllCommandes_1.');
        }

        let queryParameters = new HttpParams({encoder: this.encoder});
        if (currentPage !== undefined && currentPage !== null) {
          queryParameters = this.addToHttpParams(queryParameters,
            <any>currentPage, 'currentPage');
        }
        if (sizePage !== undefined && sizePage !== null) {
          queryParameters = this.addToHttpParams(queryParameters,
            <any>sizePage, 'sizePage');
        }

        let headers = this.defaultHeaders;

        let httpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (httpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
                'application/json'
            ];
            httpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        let responseType: 'text' | 'json' = 'json';
        if(httpHeaderAcceptSelected && httpHeaderAcceptSelected.startsWith('text')) {
            responseType = 'text';
        }

        return this.httpClient.get<CommandeResultListByStatutDTO>(`${this.configuration.basePath}/commandesByStatut`,
            {
                params: queryParameters,
                responseType: <any>responseType,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Retrieve an commande
     * @param idCommande 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getCommande(idCommande: number, observe?: 'body', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json'}): Observable<CommandeDTO>;
    public getCommande(idCommande: number, observe?: 'response', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json'}): Observable<HttpResponse<CommandeDTO>>;
    public getCommande(idCommande: number, observe?: 'events', reportProgress?: boolean, options?: {httpHeaderAccept?: 'application/json'}): Observable<HttpEvent<CommandeDTO>>;
    public getCommande(idCommande: number, observe: any = 'body', reportProgress: boolean = false, options?: {httpHeaderAccept?: 'application/json'}): Observable<any> {
        if (idCommande === null || idCommande === undefined) {
            throw new Error('Required parameter idCommande was null or undefined when calling getCommande.');
        }

        let headers = this.defaultHeaders;

        let httpHeaderAcceptSelected: string | undefined = options && options.httpHeaderAccept;
        if (httpHeaderAcceptSelected === undefined) {
            // to determine the Accept header
            const httpHeaderAccepts: string[] = [
                'application/json'
            ];
            httpHeaderAcceptSelected = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        }
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        let responseType: 'text' | 'json' = 'json';
        if(httpHeaderAcceptSelected && httpHeaderAcceptSelected.startsWith('text')) {
            responseType = 'text';
        }

        return this.httpClient.get<CommandeDTO>(`${this.configuration.basePath}/commandes/${encodeURIComponent(String(idCommande))}`,
            {
                responseType: <any>responseType,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
