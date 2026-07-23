import "./App.css";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {

    const showCourse = true;
    const showBook = true;
    const showBlog = true;

    return (
        <div className="container">

            <div className="column">
                {showCourse ? <CourseDetails /> : null}
            </div>

            <div className="column">
                {showBook ? <BookDetails /> : null}
            </div>

            <div className="column">
                {showBlog ? <BlogDetails /> : null}
            </div>

        </div>
    );
}

export default App;