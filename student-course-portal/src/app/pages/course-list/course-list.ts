import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CourseCardComponent } from '../../components/course-card/course-card';

@Component({
  selector: 'app-course-list',
  standalone: true,
  imports: [CommonModule, CourseCardComponent],
  templateUrl: './course-list.html',
  styleUrl: './course-list.css'
})
export class CourseList {

  selectedCourseId?: number;

  courses = [

    {
      id: 1,
      name: 'Angular Fundamentals',
      code: 'ANG101',
      credits: 4
    },

    {
      id: 2,
      name: 'Java Spring Boot',
      code: 'SPR201',
      credits: 5
    },

    {
      id: 3,
      name: 'React Development',
      code: 'REA301',
      credits: 4
    },

    {
      id: 4,
      name: 'Microservices',
      code: 'MIC401',
      credits: 3
    },

    {
      id: 5,
      name: 'Cloud Computing',
      code: 'CLO501',
      credits: 4
    }

  ];

  onEnroll(courseId: number) {

    console.log('Enrolling in course:', courseId);

    this.selectedCourseId = courseId;

  }

}