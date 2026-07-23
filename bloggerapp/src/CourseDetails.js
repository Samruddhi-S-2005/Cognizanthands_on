function CourseDetails() {

    const courses = [
        {
            id: 1,
            cname: "Angular",
            date: "4/5/2021"
        },
        {
            id: 2,
            cname: "React",
            date: "6/3/2021"
        }
    ];

    const coursedet = (
        <div>
            {courses.map((course) => (
                <div key={course.id}>
                    <h2>{course.cname}</h2>
                    <h4>{course.date}</h4>
                </div>
            ))}
        </div>
    );

    return (
        <div>
            <h1>Course Details</h1>
            {coursedet}
        </div>
    );
}

export default CourseDetails;