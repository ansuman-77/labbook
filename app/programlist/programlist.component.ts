import { Component, OnInit } from '@angular/core';
import { EmployeeserviceService } from '../employeeservice.service';
import { program } from 'model/program';

@Component({
  selector: 'app-programlist',
  templateUrl: './programlist.component.html',
  styleUrls: ['./programlist.component.css']
})
export class ProgramlistComponent implements OnInit {

  constructor(private employeeservice:EmployeeserviceService) { }
programs:any;
Program:program;
  ngOnInit(): void {
    this.programList();
  }

  public programList()
  {
    let view=this.employeeservice.getAllProgram();
   view.subscribe(
      (data)=>this.programs=data
    )
   
  }
  public update(id)
  {console.log(id);
   this.employeeservice.idToUpdate=id;
  }
  
  public delete(id)
  {
    var message;
   this.employeeservice.idTodelete=id;
   let del=this.employeeservice.deleteProgram();
   del.subscribe(
    (data)=>message=data
   )
  }

  
  }
  



