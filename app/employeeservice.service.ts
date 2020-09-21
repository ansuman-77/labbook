import { Injectable, IterableDiffers, Type } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';

import { Observable } from 'rxjs';
import { NgForm } from '@angular/forms';
import { program } from 'model/program';

@Injectable({
  providedIn: 'root'
})
export class EmployeeserviceService {
ProgramListURl="http://localhost:8088//programservice/viewall";
addProgramURL="http://localhost:8088//programservice/add";
updateProgramURL="http://localhost:8088//programservice/update";
findBYIdURL="http://localhost:8088//programservice/findbyId";
deleteProgramURl="http://localhost:8088//programservice/delete"
idToUpdate;
idTodelete;
  constructor(private http:HttpClient) { }

  public getAllProgram()
  {
   return this.http.get(this.ProgramListURl);
  }
  public addProgram(Program:program)
  {

  return this.http.post(this.addProgramURL,Program);
  }
  
  public getById()
  {
    let params=new HttpParams();
    params=params.set("Id",this.idToUpdate);
    return this.http.post(this.findBYIdURL,params);
  }
  public onUpdateProgram(entity:program)
  {
    entity.id=this.idToUpdate;
    console.log(entity.id);
    
   return this.http.post(this.updateProgramURL,entity);
  }
  public deleteProgram()
  {console.log(this.idTodelete);
    let params=new HttpParams();
    params=params.set("Id",this.idTodelete);
  return this.http.post(this.deleteProgramURl,params)
  }
}
