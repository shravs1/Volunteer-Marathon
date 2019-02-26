export interface IEvent{
    id:number;
    name:string;
    description:string;
    date:Date;
    startTime:Date;
    endTime:Date;
    volunteersRequired:number;
    totalVolunteeringHrs:number;
    totalTransportHrs:number;
    benificiaryName:string;
    livesImpacted:number;
    venueAddress:string;
    status:string;
    pocIds:string;
    createdBy:string;
    createdDate:Date;
    updatedBy:string;
    updatedDate:string;
}