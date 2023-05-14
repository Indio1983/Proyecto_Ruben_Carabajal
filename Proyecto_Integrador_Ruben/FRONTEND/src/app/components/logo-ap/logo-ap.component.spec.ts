import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LogoAPComponent } from './logo-ap.component';

describe('LogoAPComponent', () => {
  let component: LogoAPComponent;
  let fixture: ComponentFixture<LogoAPComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [LogoAPComponent]
    });
    fixture = TestBed.createComponent(LogoAPComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
