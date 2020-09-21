import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProgramlistComponent } from './programlist/programlist.component';
import { AddprogramComponent } from './addprogram/addprogram.component';
import { UpdateprogramComponent } from './updateprogram/updateprogram.component';



const routes: Routes = [{path:'list',component:ProgramlistComponent},{path:'addprogram',component:AddprogramComponent},{path:'update',component:UpdateprogramComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 
  
}
