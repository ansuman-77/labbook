import { Component, OnInit } from '@angular/core';
import { EmployeeserviceService } from '../employeeservice.service';

@Component({
  selector: 'app-deletecomponent',
  templateUrl: './deletecomponent.component.html',
  styleUrls: ['./deletecomponent.component.css']
})
export class DeletecomponentComponent implements OnInit {

  constructor(private employeeservice:EmployeeserviceService) { }

  ngOnInit(): void {
  }

}
