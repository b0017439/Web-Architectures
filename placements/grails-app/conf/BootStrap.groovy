import placements.Status
import placements.PlacementOpportunity
import placements.Student
class BootStrap {

    def init = { servletContext ->
        
        def appliedstatus = new Status(code:'01',description:'Applied').save();
        def notInvitedstatus = new Status(code:'02',description:'Not invited for Interview').save();
        def invitedstatus = new Status(code:'03',description:'Invited for Interview').save();
        def notOfferedtatus = new Status(code:'04',description:'Not Offered').save();
        def offeredstatus = new Status(code:'05',description:'Offered').save();
        def acceptedstatus = new Status(code:'06',description:'Accepted').save();
        def rejectedstatus = new Status(code:'07',description:'Rejected').save();
        
        def networkOpportunity = new PlacementOpportunity(jobTitle:'Network Engineer',companyName:'The Computer Guys',status:'open').save();
        def softwareOpportunity = new PlacementOpportunity(jobTitle:'Software Engineer',companyName:'Nerds R Us',status:'open').save();
        def programmingOpportunity = new PlacementOpportunity(jobTitle:'Computer Programmer',companyName:'The Programming Lab',status:'open').save();

        new Student(name:'Jen',courseCode:'WSD',notes:'none').save();
       new Student(name:'Jim',courseCode:'WSD',notes:'completed all modules').save();
        new Student(name:'Sarah',courseCode:'WSD',notes:'none').save();


    }
    def destroy = {
    }
}
