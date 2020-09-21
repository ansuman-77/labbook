import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { ProgramlistComponent } from './programlist/programlist.component';
import { AddprogramComponent } from './addprogram/addprogram.component';
import { UpdateprogramComponent } from './updateprogram/updateprogram.component';
import { DeletecomponentComponent } from './deletecomponent/deletecomponent.component';

@NgModule({
  declarations: [
    AppComponent,
    ProgramlistComponent,
    AddprogramComponent,
    UpdateprogramComponent,
    DeletecomponentComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
