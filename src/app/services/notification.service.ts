// notification.service.ts
import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';

@Injectable({
  providedIn: 'root',
})
export class NotificationService {
  constructor(private snackBar: MatSnackBar) {}

  showSuccessNotification(message: string): void {
    this.snackBar.open(message, 'OK', {
      duration: 3000,
      panelClass: 'success-notification',
    });
  }
  showErrorNotification(message: string): void {
    this.snackBar.open(message, 'OK', {
      duration: 3000,
      panelClass: 'error-notification',
    });
  }
 
  
}
