import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ResultSearchClientsComponent } from './result-search-clients.component';

describe('ResultSearchClientsComponent', () => {
  let component: ResultSearchClientsComponent;
  let fixture: ComponentFixture<ResultSearchClientsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ResultSearchClientsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ResultSearchClientsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
