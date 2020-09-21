import { Component, OnInit } from '@angular/core';
import { EmployeeserviceService } from '../employeeservice.service';
import { program } from 'model/program';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-updateprogram',
  templateUrl: './updateprogram.component.html',
  styleUrls: ['./updateprogram.component.css']
})
export class UpdateprogramComponent implements OnInit {
//id;
ProgramUpdate:program;
name;
  constructor(private employeeservice:EmployeeserviceService) { 
  //this.id=employeeservice.idToUpdate;
  
  let view=this.employeeservice.getById();
   view.subscribe(
      (data)=>this.ProgramUpdate=<program>data)
   
  
   }
 
   public onUpdateProgram(form:NgForm)
   {
     var message;
     this.ProgramUpdate=form.value;
     console.log(form.value);
     
     let up=this.employeeservice.onUpdateProgram(this.ProgramUpdate);
     up.subscribe(
       (data)=>message=data
     )
   }
  ngOnInit(): void {
  }

}
