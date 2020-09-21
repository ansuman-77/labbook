import { Component, OnInit } from '@angular/core';
import { EmployeeserviceService } from '../employeeservice.service';
import { NgForm } from '@angular/forms';
import { ProgramlistComponent } from '../programlist/programlist.component';
import { program } from 'model/program';


@Component({
  selector: 'app-addprogram',
  templateUrl: './addprogram.component.html',
  styleUrls: ['./addprogram.component.css']
})
export class AddprogramComponent implements OnInit {

  constructor(private service:EmployeeserviceService) { }
Program:program;
  ngOnInit(): void {
  }
  public onAddProgram(form:NgForm)
  {var message;
    this.Program=new program();
    this.Program.name=form.value.name;
    this.Program.description=form.value.description;
    this.Program.duration=form.value.duration;
    this.Program.eligibility=form.value.eligibility;
    this.Program.degreeCertificateOffered=form.value.degreeCertificateOffered;
    let add=this.service.addProgram(this.Program);
    add.subscribe((data)=>message=data);
  }


}
