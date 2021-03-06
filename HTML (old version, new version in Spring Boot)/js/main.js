//Global Scope Variable to Hold JSON Object and Parsed Text Data
var xmlhttp;
var majorId;

//Activate Event Listeners on Page Load
window.onload = function()
{
    init();
};

//Initialize all Event Listeners
function init()
{
    loadMajors();
    document.getElementById('btnSubmit').addEventListener('click', selectMajor, false);
}

//Template Literal to Return Major Name and Major ID
function majorTemplate(major) 
{
    return `<option value=${major.name}>${major.name}</option>`
}

//Template Literal to Return Course Name
function courseTemplate(major) 
{
    return `<tr><td>${major.name}</td></tr>`
}

//Load Drop Down ComboBox with a List of Majors
function loadMajors() 
{
            //Make a new API Request
            xmlhttp = new XMLHttpRequest();
            
            //Get Status
             xmlhttp.onreadystatechange = function() 
            {
                //Check if Status is Ready
                if (this.readyState == 4 && this.status == 200) 
                {
                    //Parse into JSON
                    const majors = jQuery.parseJSON(xmlhttp.responseText);
                    
                    //Template Literal to Add all Majors into HTML Dynamically
                    document.getElementById('combo').innerHTML = `<option>Select a Major</option>${majors.map(majorTemplate).join('')}`
                }
            };
            
            //Create API Call
            xmlhttp.open("GET", 'https://api.punkapi.com/v2/beers');
            
            //Send API Call
            xmlhttp.send();
}

//Load Table with Required Courses
function loadCourses() 
{
            //Make a new API Request
            xmlhttp = new XMLHttpRequest();
            
            //Get Status
             xmlhttp.onreadystatechange = function() 
            {
                //Check if Status is Ready
                if (this.readyState == 4 && this.status == 200) 
                {
                    //Parse into JSON
                    const majors = jQuery.parseJSON(xmlhttp.responseText);
                    
                    //Template Literal to Add all Courses into HTML Dynamically
                    document.getElementById('courses').innerHTML = `
<tr><th>Required Courses</th></tr>
${majors.map(courseTemplate).join('')}`
                }
            };
            
            //Create API Call
            xmlhttp.open("GET", 'https://api.punkapi.com/v2/beers');
            
            //Send API Call
            xmlhttp.send();
}

//Get Major Selection and Store as a Variable
function selectMajor()
{
//    alert('hi');
    var majorSelection = document.querySelector('#combo');
    majorId = majorSelection.value;
    loadCourses();
}