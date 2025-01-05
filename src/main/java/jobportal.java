import java.util.*;

class JobSeeker {
    String name;
    String email;
    List<String> skills = new ArrayList<>();
    Map<String, Integer> skillScores = new HashMap<>();
    
    public JobSeeker(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    public void takeSkillTest(String skill, int score) {
        skills.add(skill);
        skillScores.put(skill, score);
    }
}

class Employer {
    String companyName;
    List<Job> jobList = new ArrayList<>();
    
    public Employer(String companyName) {
        this.companyName = companyName;
    }
    
    public void postJob(String jobTitle, List<String> requiredSkills) {
        jobList.add(new Job(jobTitle, requiredSkills));
    }
}

class Job {
    String title;
    List<String> requiredSkills;
    
    public Job(String title, List<String> requiredSkills) {
        this.title = title;
        this.requiredSkills = requiredSkills;
    }
}

class JobPortal {
    List<JobSeeker> jobSeekers = new ArrayList<>();
    List<Employer> employers = new ArrayList<>();
    
    public void registerJobSeeker(JobSeeker seeker) {
        jobSeekers.add(seeker);
    }
    
    public void registerEmployer(Employer employer) {
        employers.add(employer);
    }
    
    public void matchJobs(JobSeeker seeker) {
        System.out.println("Jobs matching for " + seeker.name + ":");
        for (Employer employer : employers) {
            for (Job job : employer.jobList) {
                boolean match = job.requiredSkills.stream().allMatch(seeker.skills::contains);
                if (match) {
                    System.out.println(" - " + job.title + " at " + employer.companyName);
                }
            }
        }
    }
}

class Jobfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JobPortal portal = new JobPortal();
        
        while (true) {
            System.out.println("\n===== Jobfit Portal =====");
            System.out.println("1. Register as Job Seeker");
            System.out.println("2. Register as Employer");
            System.out.println("3. Job Seeker: Take Skill Test");
            System.out.println("4. Employer: Post Job");
            System.out.println("5. Job Seeker: View Matched Jobs");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String seekerName = scanner.nextLine();
                    System.out.print("Enter your email: ");
                    String seekerEmail = scanner.nextLine();
                    JobSeeker newSeeker = new JobSeeker(seekerName, seekerEmail);
                    portal.registerJobSeeker(newSeeker);
                    System.out.println("Job Seeker registered successfully!");
                    break;
                    
                case 2:
                    System.out.print("Enter company name: ");
                    String companyName = scanner.nextLine();
                    Employer newEmployer = new Employer(companyName);
                    portal.registerEmployer(newEmployer);
                    System.out.println("Employer registered successfully!");
                    break;
                    
                case 3:
                    System.out.print("Enter your email to proceed: ");
                    String email = scanner.nextLine();
                    JobSeeker seeker = portal.jobSeekers.stream()
                            .filter(js -> js.email.equals(email))
                            .findFirst()
                            .orElse(null);
                    
                    if (seeker == null) {
                        System.out.println("No Job Seeker found with this email.");
                    } else {
                        System.out.print("Enter skill name: ");
                        String skill = scanner.nextLine();
                        System.out.print("Enter skill score (0-100): ");
                        int score = scanner.nextInt();
                        seeker.takeSkillTest(skill, score);
                        System.out.println("Skill test recorded successfully!");
                    }
                    break;
                    
                case 4:
                    System.out.print("Enter company name to proceed: ");
                    String company = scanner.nextLine();
                    Employer employer = portal.employers.stream()
                            .filter(emp -> emp.companyName.equals(company))
                            .findFirst()
                            .orElse(null);
                    
                    if (employer == null) {
                        System.out.println("No Employer found with this company name.");
                    } else {
                        System.out.print("Enter job title: ");
                        String jobTitle = scanner.nextLine();
                        System.out.print("Enter required skills (comma-separated): ");
                        String[] skills = scanner.nextLine().split(",");
                        List<String> requiredSkills = Arrays.asList(skills);
                        employer.postJob(jobTitle, requiredSkills);
                        System.out.println("Job posted successfully!");
                    }
                    break;
                    
                case 5:
                    System.out.print("Enter your email to proceed: ");
                    String userEmail = scanner.nextLine();
                    JobSeeker matchedSeeker = portal.jobSeekers.stream()
                            .filter(js -> js.email.equals(userEmail))
                            .findFirst()
                            .orElse(null);
                    
                    if (matchedSeeker == null) {
                        System.out.println("No Job Seeker found with this email.");
                    } else {
                        portal.matchJobs(matchedSeeker);
                    }
                    break;
                    
                case 6:
                    System.out.println("Exiting... Thank you for using Jobfit!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
