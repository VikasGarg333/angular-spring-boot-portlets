import { Component, OnInit, Input } from '@angular/core';
import { AuthorsService } from './authors.service';
import { Author } from './Author';
import { MessageService } from '../messages/message.service';
import { BehaviorSubject, Observable } from 'rxjs';
import { finalize } from 'rxjs/operators';
import { ConfigurationService } from '../configuration.service';

@Component({
  selector: 'authors',
  templateUrl: './authors.component.html',
  styleUrls: ['./authors.component.css'],
  providers: [
    MessageService, 
    AuthorsService
  ]
})
export class AuthorsComponent implements OnInit {
  @Input() config: string;
  authors: Author[];
  author: Author;
  loadingSubject = new BehaviorSubject<boolean>(false);

  loading$:Observable<boolean> = this.loadingSubject.asObservable();

  constructor(private authorsService:AuthorsService,
    private messageService:MessageService, private configurationService:ConfigurationService) { }

  ngOnInit() {
    this.configurationService.init(this.config);
    this.loadAuthors();
  }

  loadAuthors() {
    this.loadingSubject.next(true);
    this.authorsService.listAuthors().pipe(
      finalize(() => this.loadingSubject.next(false))
    ).subscribe(
      authors => this.authors = authors
    );
  }
}
