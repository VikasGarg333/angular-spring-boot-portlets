import { Injectable } from '@angular/core';
import { MessageService } from '../messages/message.service';
import { HttpClient, HttpParams } from '@angular/common/http';
import { Author } from './Author';
import { Observable, of } from 'rxjs';
import { catchError } from 'rxjs/operators';

export interface Success {
  message:string;
}

@Injectable()
export class AuthorsService {
  
  constructor(private http: HttpClient, private messageService:MessageService) { }
  
  public listAuthors(): Observable<Author[]> {
    return this.http.get<Author[]>(`/authors`).pipe(
      catchError(error => {
        this.messageService.error(error.error["message"]);
        return of([]);
      })
    );
  }

  /*public putBook(book: Book): Observable<Success> {
    return this.http.put<Success>(`/book/${book.isbn}`, book).pipe(
      catchError(error => {
        this.messageService.error(error.error["message"]);
        return of(null);
      })
    );
  }

  public deleteBook(isbn:string) : Observable<Success> {
    return this.http.delete<Success>(`/book/${isbn}`).pipe(
      catchError(error => {
        this.messageService.error(error.error["message"]);
        return of(null);
      })
    );
   }*/
}

