import styles from "./CohortDetails.module.css";

function CohortDetails(props) {
    return (
        <div className={styles.box}>
            <h3 className={styles.heading}>
                {props.cohort.cohortCode} - {props.cohort.technology}
            </h3>

            <dl>
                <dt className={styles.label}>Started On</dt>
                <dd>{props.cohort.startDate}</dd>

                <dt className={styles.label}>Current Status</dt>
                <dd>{props.cohort.currentStatus}</dd>

                <dt className={styles.label}>Coach</dt>
                <dd>{props.cohort.coachName}</dd>

                <dt className={styles.label}>Trainer</dt>
                <dd>{props.cohort.trainerName}</dd>
            </dl>
        </div>
    );
}

export default CohortDetails;